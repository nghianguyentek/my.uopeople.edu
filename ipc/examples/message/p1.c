#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>

struct message {
  long mtype;
  char mtext[128];
};

int main() {
  const int key = 1234;
  int msqid = msgget(key, IPC_CREAT | 0666);
  if (msqid == -1) {
    perror("msgget");
    exit(1);
  }

  printf("Created/Got message queue name '%d' with id '%d'\n", key, msqid);
  
  const long mtype = 1;
  struct message msg;
  msg.mtype = mtype;
  strcpy(msg.mtext, "Hello, msg!");

  int ret = msgsnd(msqid, &msg, sizeof(msg.mtext), 0);
  if (ret == -1) {
    perror("msgsnd");
    exit(1);
  }

  printf("Sent message\n");

  return 0;
}