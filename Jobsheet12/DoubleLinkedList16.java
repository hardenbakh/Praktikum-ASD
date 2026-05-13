package Jobsheet12;

import org.w3c.dom.Node;

public class DoubleLinkedList16 {
    Node16 head;
    Node16 tail;
    int size;

    public DoubleLinkedList16(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst (Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

     public void addLast (Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, Mahasiswa16 data) {
        Node16 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM " + keyNim + "tidak ditemukan");
            return;
        }

        Node16 newNode = new Node16(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Node16 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

 public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    Node16 current = tail; 
    while (current != null) {
        current.data.tampil();
        current = current.prev; 
    }
}   


   public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }
    
    Mahasiswa16 dataDihapus = head.data; 

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    
    System.out.println("Data yang berhasil dihapus:");
    dataDihapus.tampil(); 
}

     public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }

    
    Mahasiswa16 dataDihapus = tail.data;

    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }

    System.out.println("Data yang berhasil dihapus:");
    dataDihapus.tampil(); 
}


  public void add(int index, Mahasiswa16 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node16 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node16 newNode = new Node16(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        Node16 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            Node16 target = current.next;
            if (target == tail) {
                removeLast();
            } else {
                current.next = target.next;
                target.next.prev = current;
                size--;
                System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus.");
            }
        } else {
            System.out.println("Data tidak ditemukan atau tidak ada data setelahnya.");
        }
    }

    
    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node16 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    
    public void getFirst() {
        if (isEmpty()) System.out.println("List Kosong");
        else head.data.tampil();
    }

    
    public void getLast() {
        if (isEmpty()) System.out.println("List Kosong");
        else tail.data.tampil();
    }

    
    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        Node16 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data.tampil();
    }

     
    public int getSize() {
        return size;
    }
}
