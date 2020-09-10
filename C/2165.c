#include <stdio.h>
int main()
{
	char frase[500];
	scanf("%[^\n\r]", frase);

	if ((strlen(frase) <= 140)) {
	    printf("TWEET\n");
	}
	else {
		printf("MUTE\n");
	}
	return 0;
}