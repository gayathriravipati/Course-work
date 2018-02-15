/*
 * untitled.c
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
void insert(char);
void delete(char []);
void array_complete();
void array_empty();
void print_array(char[] );
char a[15];
int count=0;
int main(int argc, char **argv)
{
	int i;
	for(i=0;i<10;i++)
	{
		scanf("%c",&a[count]);
		count++;
	}
	printf("Sample Array:");
	print_array(a);
	printf("\n");
	insert('a');
	insert('z');
	printf("After Inserting:" );
	print_array(a);
	printf("\n");
	delete(a);
	
	printf("\n");
	array_complete();
	array_empty();
	return 0;
}

void insert(char x)
{
	a[count]=x;
	count++;
}
void delete(char a[])
{
	int i=0;
	for(i=0;i<count--;i++)
	{
		a[i]=a[i+1];
	}
	printf("After Deleting:");
	for(i=0;i<12;i++)
		printf("%c ",a[i]);
		
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
void print_array(char a[])
{
	int i=0;
	for(i=0;i<count;i++)
		printf("%c ",a[i]);
}
	

