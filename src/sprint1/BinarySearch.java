package sprint1;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(String[] movies, String target) {
        int left = 0, right = movies.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid:"+mid);
            int result = target.compareTo(movies[mid]);
            if (result == 0)
                return mid; // Found
            if (result > 0){
                left = mid + 1; // Search right half
                System.out.println("left:"+left);
            }
            else{
                right = mid - 1; // Search left half
                System.out.println("right:"+right);
            }
        }
        return -1; // Not found
    }
    public static void main(String[] args) {
        String[] movies = {"Avatar","Bagman","Blitz","Carry-on","Dune","Inception", "Interstellar","Titanic","The Gorge"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the movie name to search:");
        String search = sc.next();
        int index = binarySearch(movies, search);
        System.out.println(index >= 0 ? "Found at index " + index : "Movie not found");
    }
}

