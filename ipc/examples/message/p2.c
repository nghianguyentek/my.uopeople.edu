#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>

struct message {
  long mtype;
  char mtext[128];
};

int main() {
  int key = 1234;
  int msqid = msgget(key, 0);
  if (msqid == -1) {
    perror("msgget");
    exit(1);
  }

  printf("Got message queue name '%d' with id '%d'\n", key, msqid);
  
  const long mtype = 1;
  struct message msg;

  int ret = msgrcv(msqid, &msg, sizeof(msg.mtext), mtype, MSG_NOERROR);
  if (ret == -1) {
    perror("msgrcv");
    exit(1);
  }

  printf("Received message: %s\n", msg.mtext);

  ret = msgctl(msqid, IPC_RMID, NULL);
  if (ret == -1) {
    perror("msgctl IPC_RMID");
    exit(1);
  }

  printf("Removed message queue name '%d' with id '%d'\n", key, msqid);

  return 0;
}