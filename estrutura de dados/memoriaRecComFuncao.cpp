#include <stdio.h>
#include <stdlib.h>

struct tpoint {
	int x,y;
	struct tpoint *next;
};
typedef struct tpoint point;

void free_memory(point *p)
{
	if (p==NULL) return;
	free_memory(p->next);
	free(p);
}

point *ins_end(point *f, point *p)
{
	point *aux;
	if (f==NULL)
	{
		f=p;
		return f;
    }
    for (aux=f;aux->next!=NULL;aux=aux->next);
    aux->next=p;
    return f;
}

int main()
{
	point *p, *aux, *first=NULL;
	int i;
	for (i=1;i<=10;i++)
	{
		// primeiro passo (alocação)
		p=(point *)malloc(sizeof(point));
		//segundo passo
		p->x=i;
		p->y=i+10;
		p->next=NULL;
		// terceiro encadear
		first=ins_end(first,p);
    }
    for (aux=first;aux!=NULL;aux=aux->next)
       printf("(%d,%d)\n",aux->x,aux->y);
    if (first!=NULL)
    {
      aux=first;
      while (aux->next!=NULL)
      {
		  p=aux;
		  aux=aux->next;
		  free(p);
      }
      free(aux);
      first=NULL;
    }
    //free_memory(first);
    return 0;
}
