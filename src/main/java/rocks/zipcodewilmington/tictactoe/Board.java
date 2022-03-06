package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] mat=new Character[3][3];

    public Board(Character[][] matrix) {
        this.mat=matrix;
    }




    public Boolean isInFavorOfX() {

        boolean flag=false;
        if(mat[0][0].equals('X') && mat[0][1].equals('X') &&  mat[0][2].equals('X')){  //row1
            flag=true;
        }
        else if(mat[1][0].equals('X') && mat[1][1].equals('X') &&  mat[1][2].equals('X')){  //row2
            flag=true;
        }else if(mat[2][0].equals('X') && mat[2][1].equals('X') &&  mat[2][2].equals('X')){  //row3
            flag=true;
        }else if((mat[0][0].equals('X') && mat[1][0].equals('X') &&  mat[2][0].equals('X'))){  //col1
            flag=true;
        }else if((mat[0][1].equals('X') && mat[1][1].equals('X') &&  mat[2][1].equals('X'))){
            flag=true;
        }else if((mat[0][2].equals('X') && mat[1][2].equals('X') &&  mat[2][2].equals('X'))){
            flag=true;
        }else if((mat[0][0].equals('X') && mat[1][1].equals('X') &&  mat[2][2].equals('X'))){ //diagonal top
            flag=true;
        }else if((mat[2][0].equals('X') && mat[1][1].equals('X') &&  mat[0][2].equals('X'))){  //diagonal
            flag=true;
        }

        return flag;

    }

    public Boolean isInFavorOfO() {

        boolean flag=false;
        if(mat[0][0].equals('O') && mat[0][1].equals('O') &&  mat[0][2].equals('O')){  //row1
            flag=true;
        }
        else if(mat[1][0].equals('O') && mat[1][1].equals('O') &&  mat[1][2].equals('O')){  //row2
            flag=true;
        }else if(mat[2][0].equals('O') && mat[2][1].equals('O') &&  mat[2][2].equals('O')){  //row3
            flag=true;
        }else if((mat[0][0].equals('O') && mat[1][0].equals('O') &&  mat[2][0].equals('O'))){  //col1
            flag=true;
        }else if((mat[0][1].equals('O') && mat[1][1].equals('O') &&  mat[2][1].equals('O'))){
            flag=true;
        }else if((mat[0][2].equals('O') && mat[1][2].equals('O') &&  mat[2][2].equals('O'))){
            flag=true;
        }else if((mat[0][0].equals('O') && mat[1][1].equals('O') &&  mat[2][2].equals('O'))){ //diagonal top
            flag=true;
        }else if((mat[2][0].equals('O') && mat[1][1].equals('O') &&  mat[0][2].equals('O'))){  //diagonal
            flag=true;
        }

        return flag;
    }

    public Boolean isTie() {
        if(getWinner()=="") {
            return true;
        } else{
            return false;
        }
    }

    public String getWinner() {
        String winner="";
        if(isInFavorOfO()){
            winner="O";
        }else if(isInFavorOfX()){
            winner="X";
        }
        return winner;
    }

}
