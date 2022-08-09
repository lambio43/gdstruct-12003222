public class SimpleHashTable {
    private StoredPlayer[] hashTable;

    public SimpleHashTable()
    {
        hashTable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashTable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey)) // Do linear probing
        {
            int stoppingIndex = hashedKey;

            if(hashedKey == hashTable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey =(hashedKey + 1) % hashTable.length;
            }
        }

        if (isOccupied(hashedKey))
        {
            System.out.println("Sorry, there is already an element at position " + hashedKey);
        }
        else
        {
            hashTable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashTable[hashedKey].value;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        //found the right key
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        int stoppingIndex = hashedKey;

        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex && hashTable[hashedKey] != null &&
        !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        return -1;
    }
    private boolean isOccupied(int index)
    {
        return hashTable[index] != null;
    }

    public void printHashTable()
    {
        for (int i = 0; i < hashTable.length; i++)
        {
            if (hashTable[i] != null) {
                System.out.println("Element " + i + " " + hashTable[i]);
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}
