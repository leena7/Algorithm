package BlockChain;

import java.util.Arrays;

public class Block {
    private String[] tx;
    private int blockHash;
    private int prevBlockHash;

    public Block(String[] tx, int prevBlockHash)
    {
        super();
        this.tx = tx;
        this.prevBlockHash = prevBlockHash;
        this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(tx),this.prevBlockHash});


    }

    @Override
    public String toString() {
        return "Block{" +
                "tx=" + Arrays.toString(tx) +
                ", blockHash=" + blockHash +
                ", prevBlockHash=" + prevBlockHash +
                '}';
    }

    public String[] getTx() {
        return tx;
    }

    public void setTx(String[] tx) {
        this.tx = tx;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(int prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }
}
