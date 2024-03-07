//Amber Anderson
//Chpt 6 PA

import java.util.Scanner;  //import scanner class

public class QuadraticProbing {
	//declare global variables
    public static int[] hashTable;
    public static int hashTableSize = 16;
	
	
	public static void main(String[] args) {
		int item;							//variable to hold the item to be used
        int i;									//variable used to increment
        int bucket;							//variable to hold the bucket number
		boolean inserted = false;	//variable to show if an item was inserted
        boolean removed = false;	//variable to show if an item was removed
            
		hashTable = new int[hashTableSize];
		// Initialize hashTable buckets to Empty-Since-Start (-1)
        for (i = 0; i < hashTableSize; ++i) {
            hashTable[i] = -1;
        }
		
		//Insert item 32 into the hash table. Display a message if the insert was successful or not successful.
		item = 32;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 63 into the hash table. Display a message if the insert was successful or not successful.
		item = 63;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 16 into the hash table. Display a message if the insert was successful or notsuccessful.
		item = 16;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 3 into the hash table. Display a message if the insert was successful or not successful. 
		item = 3;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 23 into the hash table. Display a message if the insert was successful or not successful.
		item = 23;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 11 into the hash table. Display a message if the insert was successful or not successful.
		item = 11;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 64 into the hash table. Display a message if the insert was successful or not successful.
		item = 64;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 99 into the hash table. Display a message if the insert was successful or not successful.
		item = 99;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 42 into the hash table. Display a message if the insert was successful or not successful.
		item = 42;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 49 into the hash table. Display a message if the insert was successful or not successful.
		item = 49;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 48 into the hash table. Display a message if the insert was successful or not successful.
		item = 48;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Insert item 21 into the hash table. Display a message if the insert was successful or not successful.
		item = 21;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Display the hash table’s contents.
		displayHashTable();
		
		//Remove item 32 from the hash table. Display a message if the insert was successful or not successful.
		item = 32;
		removed = hashRemove(item);
		if (removed) {
			System.out.println("Item " + item + " was removed successfully"); 
		} else {
			System.out.println("Item " + item + " was not found");
		}
		
		//Remove item 11 from the hash table. Display a message if the insert was successful or not successful.
		item = 11;
		removed = hashRemove(item);
		if (removed) {
			System.out.println("Item " + item + " was removed successfully"); 
		} else {
			System.out.println("Item " + item + " was not found");
		}
		
		//Search for item 64 in the hash table. Display the bucket it was found in or a message that it was not found.
		item = 64;
        bucket = hashSearch(item);
        if (bucket == -9) {
            System.out.println("Item " + item + " was not found.");
        } else {
            System.out.println("Item " + item + " was found in bucket " + bucket + ".");
        }
		
		//Insert item 9 into the hash table. Display a message if the insert was successful or not successful.
		item = 9;
		inserted = hashInsert(item);
		if (inserted) {
			System.out.println("Item " + item + " was inserted successfully"); 
		} else {
			System.out.println("Item " + item + " was not inserted successfully");
		}
		
		//Search for item 48 in the hash table. Display the bucket it was found in or a message that it was not found.
		item = 48;
        bucket = hashSearch(item);
        if (bucket == -9) {
            System.out.println("Item " + item + " was not found.");
        } else {
            System.out.println("Item " + item + " was found in bucket " + bucket + ".");
        }
		
		//Search for item 32 in the hash table. Display the bucket it was found in or a message that it was not found.
		item = 32;
        bucket = hashSearch(item);
        if (bucket == -9) {
            System.out.println("Item " + item + " was not found.");
        } else {
            System.out.println("Item " + item + " was found in bucket " + bucket + ".");
        }
		
		//Remove item 64 from the hash table. Display a message if the insert was successful or not successful.
		item = 64;
		removed = hashRemove(item);
		if (removed) {
			System.out.println("Item " + item + " was removed successfully"); 
		} else {
			System.out.println("Item " + item + " was not found");
		}
		
		//Remove item 99 from the hash table. Display a message if the insert was successful or not successful.
		item = 99;
		removed = hashRemove(item);
		if (removed) {
			System.out.println("Item " + item + " was removed successfully"); 
		} else {
			System.out.println("Item " + item + " was not found");
		}
		
		//Display the hash table’s contents.
		displayHashTable();
	}
	
	public static int hash(int key) {
		//returns the bucket number to insert the item in the hash table based on a Modulo hash function
		return key % hashTableSize;
	}
	
	public static boolean hashInsert(int item) {
		//inserts an item into the hash table if possible, returns true if successful and false if unsuccessful
		int c1 = 1;	//variable for quadratic probing
		int c2 = 1;	//variable for quadratic probing
		int bucket;
        int bucketsProbed = 0;
		int i = 0;
        // Hash function determines initial bucket
        bucket = hash(item) % hashTableSize;
        while (bucketsProbed < hashTableSize) {
            // Insert item in next empty bucket
            if ((hashTable[bucket] == -1) || (hashTable[bucket] == -2)) {
                hashTable[bucket] = item;
                return true;
            }
            // Increment i and recompute bucket index
			++i;
            bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
          
            // Increment number of buckets probed
            ++bucketsProbed;
        }
		return false;
	}
	
	public static boolean hashRemove(int item) {
		//removes an item from the hash table and returns true if the item was removed and false if the item was not found
		int c1 = 1;	//variable for quadratic probing
		int c2 = 1;	//variable for quadratic probing
		int bucket;
        int bucketsProbed = 0;
		int i = 0;
        // Hash function determines initial bucket
        bucket = hash(item) % hashTableSize;
		while ((hashTable[bucket] != -1) && (bucketsProbed < hashTableSize)) {
			if (hashTable[bucket] == item) {
				// Sets the bucket to EmptyAfterRemoval
				hashTable[bucket] = -2;
				return true;
			}
			//increment i and recompute bucket index
			++i;
            bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
             // Increment number of buckets probed
            ++bucketsProbed;
        }
		return false; 
	}
	
	public static int hashSearch(int item) {
		//searches for an item in the hash table and returns the bucket number in the hash table if found and -9 if not found.
		int c1 = 1;	//variable for quadratic probing
		int c2 = 1;	//variable for quadratic probing
		int bucket;
        int bucketsProbed = 0;
		int i = 0;
        // Hash function determines initial bucket
        bucket = hash(item) % hashTableSize;
        while (hashTable[bucket] != -1 && bucketsProbed < hashTableSize) {
            if (hashTable[bucket] == item) {
                return bucket;
			}
			// Increment i and recompute bucket index
            ++i;
			bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
            // Increment number of buckets probed
            ++bucketsProbed;
        }
        return -9; // Item not found
	}
	
	public static void displayHashTable() {
		//prints the hash table index and value from top to bottom, one on each line.
		int i;
        System.out.println("\nThe hash table contents are: ");
        for (i = 0; i < hashTableSize; ++i) {
            System.out.println("HashTable[" + i + "] is " + hashTable[i]);
        }
        System.out.println("\n");
	}
}