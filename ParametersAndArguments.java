public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare the width and height of the room
        int roomWidth = 10;
        int roomHeight = 15;
        
        // Call the calculateArea method and store the result in area
        int area = calculateArea(roomWidth, roomHeight);
        
        // Print the result
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate the area of a room
    public static int calculateArea(int width, int height) {
        // Calculate the area by multiplying width and height
        int area = width * height;
        return area;
    }
}
