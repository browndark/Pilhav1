import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    private Deque<Integer> stack;

    public Pilha() {
        stack = new ArrayDeque<>();
    }

    public void push(int element) {
        stack.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Elemento do topo da pilha: " + pilha.peek());

        while (!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
        }
    }
}

