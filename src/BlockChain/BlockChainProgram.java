package BlockChain;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram
{
    public static void main(String args[])
    {
        String statement = " My name is leena.";
        int hashcode = statement.hashCode();
        System.out.println("the hashcode of statement is ="+hashcode);

        //Array hashing
        String [] list1 = {"Leena","Agrawal","Rini","Agrawal"};
        String [] list2 = {"Leena","Agrawal","Rini"," Agrawal"};
        int hash1 =Arrays.hashCode(list1);
        int hash2=Arrays.hashCode(list2);
        System.out.println("hash code 1 = "+hash1+"hash code 2 ="+ hash2);

        //demonstrate series of blocks in chain
        ArrayList<Block> blockChain = new ArrayList<Block>();
        String [] initial_values= {"Shad has $700 Mighel has $ 550"};
        Block firstBlock= new Block(initial_values,0);
        blockChain.add(firstBlock);

        System.out.println("First block is"+ firstBlock.toString());
        System.out.println("Block chain is " + blockChain.toString());

// Secound block

        //ArrayList<Block> blockChain = new ArrayList<Block>();
        String [] giveAwayTx= {"Shad has $70 Mighel has $ 55"};
        Block secBlock= new Block(giveAwayTx,firstBlock.getBlockHash());
        blockChain.add(secBlock);

        System.out.println("Second block is"+ secBlock.toString());
        System.out.println("Block chain is " + blockChain.toString());

// Third block

        //ArrayList<Block> blockChain = new ArrayList<Block>();
        String [] shadGivesBackTX= {"Shad gives back $50","Tim gives back $20"};
        Block thirdBlock= new Block(giveAwayTx,secBlock.getBlockHash());
        blockChain.add(thirdBlock);

        System.out.println("third block is"+ thirdBlock.toString());
        System.out.println("Block chain is " + blockChain.toString());



    }
}
