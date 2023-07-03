#include "nextid.h"

_Atomic int id = 0;
int* nextid_1_svc(void *argp, struct svc_req *rqstp) {
  int newid = ++id;
	int* result = &newid;
	return result;
}