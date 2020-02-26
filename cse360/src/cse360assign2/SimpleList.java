package cse360assign2;

/* Carlos Graciano
* Class ID 
* Assigment #1 
* This program is a list program that you can add, remove, count,
* and search in the particular string.
*/

/*
 * This is where the class starts.
 */
public class SimpleList

{

/*
 * Private list and counter to be used inside the methods.
 */
	
private int[] list;

private int count;

/*
 * First method, this method will create an array to hold 10 integers and is set count to
 *0 by default.
*/

public SimpleList()

{

list = new int[10];

count = 0;

}

/*
 *  this method will add the to the list, but if there's no space, then we will discard
 *  the last number.
*/

public void add(int index)

{


if(count == 0)

	{

    list[count] = index;

      count++;

	}

else if(count < 10)

		{

for(int i = count; i >= 0; i--)

			{

	list[i + 1] = list[i];

			}

		list[0] = index;

count++;

		}

else

{

list[count - 1] = 0;

for(int i = count; i >= 0; i--)

{

list[i + 1] = list[i];

}

list[0] = index;

count++;

}


}

//This method is for removing anything that you insert in the parameter 'num'. Whenever 
// you call it and insert the in num, it will go out of the array list from simplelist.
//The rest of the numbers will go down in line. 
//at the end the count
public void remove(int num)

{

	/*
	 * remove method starts with the search method to grab the element.
	 */
	int index = search(num);

if(index != -1)

	{

	for(int i = index; i < count - 1; i++)

		{

			list[i] = list[i + 1];

		}

	count--;



	}

}

/*
 * This method is simple, it will return the number of element in the list.
 */
public int count()

{

return count;

}

/*
 * toString will return the list as a String.
 * Whenever you call this function, the array will be converted as a string and there will be a space
 * in between each elements. There's not space in the last number.
 *  
 */
public String toString()

{

//this will give me the result I need to not put a space at the very end. 
String toString1 = "";

//this will go through all of numbers in the array.
for(int i = 0; i < count; i++)

{
		/*
		 * Will store each elements of the array in toString1.
		 */
		toString1 = toString1 + list[i];

		/*
		 *  This for loop will implement the space in between each of the elements in the
		 *   array.
		 */
		if(i != count - 1)

		{
	
			toString1 = toString1 + " ";
	
		}

}

/*
 * My Return Will be the String plus a no space at the end. 
 */
return toString1;

}

/*
 * This method will return the location of the parameter in the list. 
 * if it doesnt find whatever you inserted in the parameter, it will return -1.
 */

public int search(int num)

{

int return1 = -1;

// this for loop will go through all of the list and see if there's what you inserted.
for(int i = 0; i < count; i++)

	{
	//if you find something, the it will return that number that you where looking for. else, just -1
	if(list[i] == num)

		{

			return1 = i;

		}

	}
//this is where it returns -1 if passes through everything.
return return1;

}



}

