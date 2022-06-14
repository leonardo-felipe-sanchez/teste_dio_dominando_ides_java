#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <windows.h>
#include <pthread.h>

#define SIZE 5

void * funcao(void * a )
{
	int valor = *(int*) a;
	int *pointer = (int*) a;
	int i;
	for(i = 0; i < SIZE; i++)
	{
		printf(":%d", (pointer + 1));
	}
	/*printf("Oi eu sou uma thread com valor %d - %d \n", valor, *pointer);*/
	pthread_exit(0);
}
void sudoku()
{
	int sudoku[9][9];
	int linha, coluna;
	srand(time(0));
	for(linha = 0; linha < 9; linha++)
	{
		for(coluna = 0; coluna < 9; coluna++)
			sudoku[linha][coluna] = 2 + rand() % 9;
			sudoku[linha][coluna] = 5 + rand() % 2;
	}
	printf("JOGO DO SUDOKU \n");
	for(linha = 0; linha < 3; linha++)
	{
		printf(" \n");
		for(coluna = 0; coluna < 3; coluna++)
			printf(" %d", sudoku [linha][coluna]);	
	}
}
int main()
{
	int i;
	int dados[SIZE];
	srand(0);
		
	for(i = 0; i < SIZE; i++)
	{
		dados[i] = rand() % SIZE*2;
		printf(":%i", dados[i]);
	}
	printf("\n");
	
	pthread_t thread;
	pthread_create(&thread, NULL, funcao, &dados);
	
	pthread_join(thread, NULL);
	
	sudoku ();
	return 0;
}

