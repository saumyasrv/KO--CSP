#include "stdio.h"
int main()
{   
  long a,b,da,db;
  long pa=0,pb=0;
  scanf("%ld %ld %ld %ld",&a,&b,&da,&db);
  while(a!=0)
  {
     if(a%10==da)
     {
         pa=pa*10+da;
     }
     a=a/10;
  }
   while(b!=0)
  {
     if(b%10==db)
     {
         pb=pb*10+db;
     }
     b=b/10;
  }
  printf("pa+pb=%ld\n",(pa+pb));
  return 0;
}