// CORRIGIR LINHA 49
#include <stdio.h>
#include <stdlib.h>

struct txy {
	int x;
	int y;
	struct txy *next;
};
typedef struct txy xy;

void free_memory(point *p)
{
	if (p==NULL) return;
	free_memory(p->next);
	free(p);
}


int main()
{
	xy *ponto, *first=NULL, *aux;
	int i;
	for (i=0;i<10;i++)
	{
		// Passo 1
		ponto=(xy *)malloc(sizeof(xy));
		// Passo 2
		ponto->x=i+1;
		ponto->y=ponto->x+21;
		ponto->next=NULL;
		//Passo 3
		if (first==NULL)
		{
			first=ponto;
			aux=ponto;
		} else {
			aux->next=ponto;
			aux=ponto
		}
    }
                                                                                                              //aux=first;
    / /while (aux!=NULL)
    //{
	//	printf("(%d,%d)\n",aux->x,aux->y);
	//	aux=aux->next;
    //}
    printf("I'm gonna show everything!\n");
    for (aux=first;aux!=NULL;aux=aux->next)
    {
		printf("(%d,%d)\n",aux->x,aux->y);
    }
    //DESELECIONA
    printf("Now, release all memory!\n");
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
    return 0;
}
