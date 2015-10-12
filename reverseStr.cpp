#include <string>
#include <stdio.h>

/*
	Reverses null terminated string
*/

using namespace std;

void reverse(char* str){
	
	if(str){

		char *nd=str;
		char tmp;

		while(*nd!='\0'){
			nd++;
		}
		nd--;

		while(str<nd){
			tmp = *str;
			*str = *nd;
			*nd = tmp;
			str++;
			nd--;
		}		
	}
}

int main ()
{
   
   char str[256];
   scanf("%s", str);

   reverse(str);

   printf("%s\n", str);

   return 0;
}