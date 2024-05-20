#include <stdio.h>
#include <stdlib.h>

typedef struct no {
  int valor;
  struct no *proximo;
} No;

// Função para concatenar duas listas encadeadas
No *concatena(No *lista1, No *lista2) {
  // Se a lista 1 for vazia, retorna a lista 2
  if (lista1 == NULL) {
    return lista2;
  }

  // Se a lista 2 for vazia, retorna a lista 1
  if (lista2 == NULL) {
    return lista1;
  }

  // Percorre a lista 1 até encontrar o último nó
  No *ultimoLista1 = lista1;
  while (ultimoLista1->proximo != NULL) {
    ultimoLista1 = ultimoLista1->proximo;
  }

  // Conecta a lista 2 ao último nó da lista 1
  ultimoLista1->proximo = lista2;

  // Retorna a lista 1 (com a lista 2 concatenada)
  return lista1;
}

// Função para imprimir uma lista encadeada
void imprimeLista(No *lista) {
  while (lista != NULL) {
    printf("%d ", lista->valor);
    lista = lista->proximo;
  }
  printf("\n");
}

int main() {
  // Cria duas listas encadeadas de exemplo
  No *lista1 = malloc(sizeof(No));
  lista1->valor = 10;
  lista1->proximo = malloc(sizeof(No));
  lista1->proximo->valor = 20;
  lista1->proximo->proximo = malloc(sizeof(No));
  lista1->proximo->proximo->valor = 30;
  lista1->proximo->proximo->proximo = NULL;

  No *lista2 = malloc(sizeof(No));
  lista2->valor = 40;
  lista2->proximo = malloc(sizeof(No));
  lista2->proximo->valor = 50;
  lista2->proximo->proximo = NULL;

  // Concatena as listas e imprime o resultado
  No *listaConcatenada = concatena(lista1, lista2);
  imprimeLista(listaConcatenada);

  // Libera a memória alocada para as listas
  free(lista1);
  free(lista1->proximo);
  free(lista1->proximo->proximo);
  free(lista2);
  free(lista2->proximo);

  return 0;
}
