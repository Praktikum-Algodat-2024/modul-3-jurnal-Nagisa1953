public class LinkedListDouble {
    Node head;
    Node tail;

    public void add(String namaArtis, String judul, String genre, int tahunRilis, int menit, int detik) {
        Node lagu = new Node(namaArtis, judul, genre, tahunRilis, menit, detik);
        if (head == null) {
            head = tail = lagu;
        } else {
            tail.next = lagu;
            lagu.prev = tail;
            tail = lagu;
        }
    }

    public void display() {
        int count = 1;
        Node current = head;

        System.out.println("===================================================================================");
        System.out.println("||                                  LOL Playlist                                 ||");
        if (current == null) {
            System.out.println("\t\t\tThere is no song in the playlist yet.");
            return;
        }
        while (current != null) {
            System.out.println("===================================================================================");
            System.out.printf("%15d | %s (%d)\n", count, current.namaArtis + " - " + current.judul, current.tahunRilis);
            System.out.printf("%15d:%02d %25s\n", current.menit, current.detik, current.genre);
            count++;
            current = current.next;
        }
        System.out.println("===================================================================================");
    }

    public void bubbleSort() {
        boolean swapped;
        Node temp;

        do {
            swapped = false;
            temp = this.head;

            while (temp != null && temp.next != null) {

                if (temp.menit > temp.next.menit || (temp.menit == temp.next.menit && temp.detik > temp.next.detik)) {

                    swapNodeData(temp, temp.next);
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    public void displaysearch(String targetTitle) {
        int count = 1;
        Node curr = this.head;

        System.out.println("===================================================================================");
        System.out.println("||                                  LOL Playlist                                 ||");
        while (curr != null) {
            if (curr.judul.equals(targetTitle)) {
                System.out
                        .println("===================================================================================");
                System.out.println("Judul lagu yang di cari : " + curr.judul);
                System.out.println(
                        "Lagu yang sesuai dengan judul '" + curr.judul + "' ditemukan pada posisi ke - " + count);
                System.out
                        .println("===================================================================================");
                System.out.printf("%15d |  %s (%d)\n", count, curr.namaArtis + " - " + curr.judul, curr.tahunRilis);
                System.out.printf("%15d:%02d %25s\n", curr.menit, curr.detik, curr.genre);
            }
            curr = curr.next;
            count++;
        }
        System.out.println("===================================================================================");
    }

    public void selectionSort() {
        Node start = head;

        while (start != null) {
            Node maxNode = start;
            Node curr = start.next;

            while (curr != null) {
                if (curr.tahunRilis > maxNode.tahunRilis) {
                    maxNode = curr;
                }
                curr = curr.next;
            }

            if (maxNode != start) {
                swapNodeData(maxNode, start);
            }
            start = start.next;
        }
    }

    public void swapNodeData(Node node1, Node node2) {
        int tempYear = node1.tahunRilis;
        node1.tahunRilis = node2.tahunRilis;
        node2.tahunRilis = tempYear;

        String tempNamaArtis = node1.namaArtis;
        node1.namaArtis = node2.namaArtis;
        node2.namaArtis = tempNamaArtis;

        String tempJudul = node1.judul;
        node1.judul = node2.judul;
        node2.judul = tempJudul;

        String tempGenre = node1.genre;
        node1.genre = node2.genre;
        node2.genre = tempGenre;

        int tempMenit = node1.menit;
        node1.menit = node2.menit;
        node2.menit = tempMenit;

        int tempDetik = node1.detik;
        node1.detik = node2.detik;
        node2.detik = tempDetik;
    }
}