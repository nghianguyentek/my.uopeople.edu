#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/shm.h>

int main() {
  int key = 1234;
  int shmid = shmget(key, 1024, IPC_CREAT | 0666);
  if (shmid == -1) {
    perror("shmget");
    exit(1);
  }

  printf("Created/got shared memory segment name '%d' with id '%d'\n", key, shmid);
  void* shmp = shmat(shmid, NULL, 0);
  if (shmp == (void*) -1) {
    perror("shmat");
    exit(1);
  }

  printf("Attached\n");
  char* msg = "Hello, shm!";
  memcpy(shmp, msg, strlen(msg) + 1);

  int dtr = shmdt(shmp);
  if (dtr == -1) {
    perror("shmdt");
    exit(1);
  }

  printf("Detached\n");

  return 0;
}