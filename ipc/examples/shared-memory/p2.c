#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/shm.h>

int main() {
  int key = 1234;
  int shmid = shmget(key, 1024, 0666);
  if (shmid == -1) {
    perror("shmget");
    exit(1);
  }

  printf("Got shared memory segment name '%d' with id '%d'\n", key, shmid);
  void* shmp = shmat(shmid, NULL, 0);
  if (shmp == (void*) -1) {
    perror("shmat");
    exit(1);
  }

  printf("Attached\n");
  char* msg = (char*)shmp;
  int len = strlen(msg);
  if (len > 0) {
    printf("Received message: %s\n", msg);
  }

  int dtr = shmdt(shmp);
  if (dtr == -1) {
    perror("shmdt");
    exit(1);
  }

  printf("Detached\n");

  dtr = shmctl(shmid, IPC_RMID, NULL);
  if (dtr == -1) {
    perror("shmctl IPC_RMID");
    exit(1);
  }

  printf("Removed the shared memory segment name '%d' with id '%d'\n", key, shmid);

  return 0;
}