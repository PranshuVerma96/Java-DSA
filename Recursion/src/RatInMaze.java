import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {
    static boolean isSafeToMove(int newX, int newY,int n, int maze[][], boolean visited[][]){
        // out of bound bala case
        if(newX <0 || newX>=n || newY <0 || newY >=n){
            return false;  // safe nahi he
        }
        //. blocked cell bala case
        else if(maze[newX][newY] == 0){
            // iska matlab cell block he app nahi ja sakte
            return false;
        }
        // already bala case
        else if(visited[newX][newY]){
            // iska matlab app pile ise visted kar cuke he
            // to app nahi ja sate
            return false;
        }
        else {
            return true;
        }
    }
    static void solve(
            int [][] maze,
            int srcX,
            int srcY,
            int desX,
            int desY,
            boolean [][] visited,
            ArrayList<String> ans,
            String path ){
        //base case
        if(srcX == desX && srcY == desY){
            // app pauch cuke ho
            ans.add(path);
            return;
        }
        int n = maze.length;
        visited[srcX][srcY] = true;
        // ab I have four movements
        //up
        int newX = srcX -1;
        int newY = srcY;

        if(isSafeToMove(newX,newY,n,maze,visited)){
            // toh baki recursion sambal lega
            solve(maze,newX,newY,desX,desY,visited,ans,path + "U");
        }
        //down
        newX = srcX+1;
        newY = srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            // to down jao baki recursion pe jane do
            solve(maze,newX,newY,desX,desY,visited,ans,path+"D");
        }
        //left
        newX = srcX;
        newY = srcY-1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            // to left jao baki recursion pe jane do
            solve(maze,newX,newY,desX,desY,visited,ans,path+"L");
        }
        // right
        newX = srcX;
        newY = srcY+1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            // to Right jao baki recursion pe jane do
            solve(maze,newX,newY,desX,desY,visited,ans,path+"R");
        }
        // because me charro driection try kar li he
        // ab mugeh bahsp jana he
        // ab mughe pabas jana he

        visited[srcX][srcY] = false;
        // ye baut important he ye me bar bar bool jata hu
        // backtracking step

    }
    static ArrayList<String> ratInMaze(int [][] maze){
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        int srcX =0;
        int srcY = 0;
        int desX = n-1;
        int desY = n-1;
        String path = "";

        // if src location is blocked cell and dest cell is boleced sell
        if(maze[0][0]==0 || maze[n-1][n-1] ==0){
            return ans;
        }
        boolean [][] visited = new boolean[n][n];
        solve(maze,srcX,srcY, desX,desY,visited,ans,path);
        Collections.sort(ans);
        return  ans;
    }

    public static void main(String[] args) {
    int [][] maze = {{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
    ArrayList<String> ans = ratInMaze(maze);
        System.out.println("All path is :==>");
        System.out.println(ans);
    }
}
