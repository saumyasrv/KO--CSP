#include<stdio.h>
int main() 
{
    int arr[100];
    int n , m , count = 0;
    scanf("%d %d", &n, &m);
    m = m % n;
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = n - m; i < n; i++)
    {
        printf("%d", arr[i]);
        count++;

        if (count < n)
        {
            printf(" ");
        }
    }

    for (int i = 0; i < n - m -1; i++)
    {
        printf("%d", arr[i]);
        count++;

        if (count < n)
        {
            printf(" ");
        }
    }
    
    return 0;
    
}
