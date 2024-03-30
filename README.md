# Pilhav1
Estudos sobre o comando Pilha, um exercicio de estudos.
Pilha (Stack)
Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. Isso significa que você só pode adicionar ou remover elementos no topo da pilha.

Operações Principais:
Push: Adiciona um elemento ao topo da pilha.
Pop: Remove o elemento do topo da pilha.
Peek (ou Top): Retorna o elemento no topo da pilha sem removê-lo.
isEmpty: Verifica se a pilha está vazia.
size: Retorna o número de elementos na pilha.
Implementação em Java:
Em Java, você pode implementar uma pilha utilizando a classe Stack da biblioteca Java.util ou, de forma mais comum, utilizando a classe Deque com a implementação ArrayDeque, que é mais eficiente. Aqui está um exemplo de como você pode implementar uma pilha utilizando Deque:
import java.util.Deque;
import java.util.ArrayDeque;
Aqui estou importando as classes necessárias para trabalhar com a interface Deque e sua implementação ArrayDeque, que serão usadas para construir nossa pilha.

Declaração da classe Pilha:

java
Copy code
public class Pilha {
Aqui declaramos uma classe chamada Pilha.

Declaração dos membros:

java
Copy code
private Deque<Integer> stack;
Declaramos um membro stack que é um objeto da interface Deque que armazenará os elementos da pilha como inteiros.

Construtor:

java
Copy code
public Pilha() {
    stack = new ArrayDeque<>();
}
O construtor cria uma nova instância da pilha, inicializando o stack como uma nova ArrayDeque.

Método push:

java
Copy code
public void push(int element) {
    stack.push(element);
}
O método push adiciona um elemento ao topo da pilha.

Método pop:

java
Copy code
public int pop() {
    if (isEmpty()) {
        throw new IllegalStateException("Pilha vazia");
    }
    return stack.pop();
}
O método pop remove e retorna o elemento do topo da pilha. Antes de tentar remover, ele verifica se a pilha está vazia.

Método peek:

java
Copy code
public int peek() {
    if (isEmpty()) {
        throw new IllegalStateException("Pilha vazia");
    }
    return stack.peek();
}
O método peek retorna o elemento do topo da pilha sem removê-lo, mas primeiro verifica se a pilha está vazia.

Método isEmpty:

java
Copy code
public boolean isEmpty() {
    return stack.isEmpty();
}
O método isEmpty verifica se a pilha está vazia.

Método size:

java
Copy code
public int size() {
    return stack.size();
}
O método size retorna o número de elementos na pilha.

Método main:

java
Copy code
public static void main(String[] args) {
    Pilha pilha = new Pilha();
    pilha.push(10);
    pilha.push(20);
    pilha.push(30);

    System.out.println("Tamanho da pilha: " + pilha.size());
    System.out.println("Elemento no topo: " + pilha.peek());

    while (!pilha.isEmpty()) {
        System.out.println("Removido: " + pilha.pop());
    }
}
Aqui é um método main que testa nossa implementação da pilha. Criamos uma pilha, adicionamos alguns elementos, exibimos o tamanho da pilha e o elemento no topo, e então removemos todos os elementos da pilha.
