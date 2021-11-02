package com.helloworld;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// demonstrate a hash function
        String statement1 = "Hello World!";
        int hashvalue = statement1.hashCode();

        //System.out.println("Statement = " + statement1 + " whose hash value is " + hashvalue);

    // let's hash an array
        String [] list1 = {"Alice", "Bob", "Eve"};
        String [] list2 = {"Alice", "Bob", "Eve"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        //System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);

    // demonstrate a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //block 1
        String[] initialValues = {"Alice has £1000", "Bob has £850"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());
        //blockHash = -2002238277

        //block 2
        String[] aliceLends = {"Alice gives Bob £70", "Alice gives Eve £90", "Alice gives Mallory £130"};
        Block secondBlock = new Block(aliceLends, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());
        //blockHash = 47934291

        //block 3
        String[] aliceCollects = {"Bob gives Alice £40", "Eve gives Alice £80"};
        Block thirdBlock = new Block(aliceCollects, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());
        //blockHash = -1497169544

    }
}
