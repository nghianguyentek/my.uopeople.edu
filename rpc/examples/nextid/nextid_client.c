#include <stdio.h>
#include "nextid.h"

void next_id_1(char *host)
{
	CLIENT *clnt;
	int  *result_1;
	char *nextid_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, NEXT_ID, VER_1, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */

	result_1 = nextid_1((void*)&nextid_1_arg, clnt);
	if (result_1 == (int *) NULL) {
		clnt_perror (clnt, "call failed");
	} else {
		printf("New ID: %d\n", *result_1);
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int main (int argc, char *argv[]) {
	char *host;

	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	
	host = argv[1];
	next_id_1 (host);
	exit (0);
}