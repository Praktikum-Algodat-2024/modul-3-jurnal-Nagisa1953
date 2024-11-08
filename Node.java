public class Node {
    String namaArtis, judul, genre;
    int tahunRilis, menit, detik;
    Node next;
    Node prev;

    public Node(String namaArtis, String judul, String genre, int tahunRilis, int menit, int detik) {
        this.namaArtis = namaArtis;
        this.judul = judul;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
        this.menit = menit;
        this.detik = detik;
        this.next = null;
        this.prev = null;
    }
}