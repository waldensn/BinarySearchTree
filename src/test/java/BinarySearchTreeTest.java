
import com.mycompany.binarysearchtree.Node;
import com.mycompany.binarysearchtree.Tree;
import org.junit.*;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private Tree tree;
    
    //Tree diagram
//                 50
//
//         30             80
//
//      10   45         70   95
//
//     5    35  48    55    90  105
    
    @Before
    public void setUpClass() {
        Node root = new Node(50);
        tree = new Tree(root);
        tree.insert(30);
        tree.insert(80);
        tree.insert(10);
        tree.insert(45);
        tree.insert(70);
        tree.insert(95);
        tree.insert(5);
        tree.insert(35);
        tree.insert(48);
        tree.insert(55);
        tree.insert(90);
        tree.insert(105);
    }
    
    @Test
    public void testSearchTree() throws Exception{
        Node node50 = tree.search(50);
        assertEquals(node50.getLeft().getData(), 30);
        assertEquals(node50.getRight().getData(), 80);
        assertNull(node50.getParent()); 
        
        Node node70 = tree.search(70);
        assertEquals(node70.getLeft().getData(), 55);
        assertNull(node70.getRight());
        assertEquals(node70.getParent().getData(), 80); 
        
        Node node90 = tree.search(90);
        assertNull(node90.getLeft());
        assertNull(node90.getRight());
        assertEquals(node90.getParent().getData(), 95); 
        
        Node node95 = tree.search(95);
        assertEquals(node95.getLeft().getData(), 90);
        assertEquals(node95.getRight().getData(), 105);
        assertEquals(node95.getParent().getData(), 80); 
        
        Node node5 = tree.search(5);
        assertNull(node5.getLeft());
        assertNull(node5.getRight());
        assertEquals(node5.getParent().getData(), 10); 
    }
    
    @Test
    public void testTreeContains() throws Exception{
        assertTrue(tree.contains(70));
        assertTrue(tree.contains(35));
        assertTrue(tree.contains(50));
        assertTrue(tree.contains(95));
        assertFalse(tree.contains(91));
        assertFalse(tree.contains(96));
        assertFalse(tree.contains(72));
        assertFalse(tree.contains(106));
        tree.insert(106);
        assertTrue(tree.contains(106));
        tree.insert(96);
        assertTrue(tree.contains(96));
    }

    @Test
    public void testCountNodes() throws Exception{
        assertEquals(this.tree.getNumberOfNodes(), 13);
        tree.insert(65);
        assertEquals(this.tree.getNumberOfNodes(), 14);
        tree.insert(6);
        assertEquals(this.tree.getNumberOfNodes(), 15);
    }
    
//    @Test
//    public void testTraversals() throws Exception{
//        
//    }
}
