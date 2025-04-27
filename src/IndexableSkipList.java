public class IndexableSkipList extends AbstractSkipList {
    final protected double probability;
    public IndexableSkipList(double probability) {
        super();
        this.probability = probability;
    }

    @Override
    public SkipListNode find(int key) {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

    @Override
    public int generateHeight() {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

    public int rank(int key) {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

    public int select(int index) {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

}
