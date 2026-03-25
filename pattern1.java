#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    int i,j;
    scanf("%d", &n);
    int l=2*n-1;
    for(i=0;i<l;i++)
    {
        for(j=0;j<l;j++)
        {
            int a=i;
            int b=j;
            int c=l-1-i;
            int d=l-1-j;
            int e=a;
            if(b<e) e=b;
            if(c<e) e=c;
            if(d<e) e=d;
            printf("%d ",n-e);
        }
        printf("\n");
    }
    return 0;
}



2 2 2
2 1 2
2 2 2


