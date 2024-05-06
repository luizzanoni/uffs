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
//
void print_all (point *f)
{
	point *aux;
	for (aux=f;aux!=NULL;aux=aux->next)
	       printf("(%d,%d)\n",aux->x,aux->y);

}
//
//
void print_reverse(point *f)
{
	if (f==NULL) return;
	print_reverse(f->next);
    printf("(%d,%d)\n",f->x,f->y);
}
//
void print_ascending(point *f)
{
	if (f==NULL) return;
    printf("(%d,%d)\n",f->x,f->y);
	print_ascending(f->next);
}

//

int main()
{
	point *p, *aux, *first=NULL;
	int i;
	for (i=1;i<=5;i++)
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
    print_ascending(first);
    printf("=================\n");
    print_reverse(first);
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
