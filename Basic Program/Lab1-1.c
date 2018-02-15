/*
 * Lab1-1.c
 * 
 * Copyright 2017 Nukala Thomala Lakshmi Saranya <u4cse16146@11CPU0224L>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


#include <stdio.h>
void insert(int);
void delete();
void array_complete();
void array_empty();
void print_array(int[] );
int a[15];
int count=0;
int main(int argc, char **argv)
{
	int i;
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[count]);
		count++;
	}
	printf("Sample Array:");
	print_array(a);
	printf("\n");
	insert(100);
	insert(200);
	printf("After Inserting:" );
	print_array(a);
	printf("\n");
	for(i=0;i<5;i++)
	{
		delete();
	}
	printf("After Deleting:");
	print_array(a);
	printf("\n");
	array_complete();
	array_empty();
	return 0;
}

void insert(int x)
{
	a[count]=x;
	count++;
}
void delete()
{
	a[count--]=0;
}
void array_complete()
{
	if(count==15)
		printf("Array is complete");
}
void array_empty()
{
	if(count==0)
		printf("Array is empty");
}
void print_array(int a[])
{
	int i=0;
	for(i=0;i<count;i++)
		printf("%d ",a[i]);
}
	
