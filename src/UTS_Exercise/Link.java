/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package UTS_Exercise;

/**
 *
 * @author arkan
 */
public class Link {

    public long NIM;
    public double score;
    public Link next;
    public Link prev;

    public Link(long NIM, double score) {
        this.NIM = NIM;
        this.score = score;
    }

    public void displayLink() {
        System.out.println(NIM + ", score " + score);
    }

    public double getScore() {
        return score;
    }

}
