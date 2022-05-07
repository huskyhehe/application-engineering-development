package direction;

public class Robot {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 0;    // 0 = north, 1 = east, 2 = south, 3 = west

        for( char ch : instructions.toCharArray() ) {
            switch( ch ) {
                case 'L':
                    dir = (dir + 1) % 4;
                    break;

                case 'R':
                    dir = (dir + 3) % 4;
                    break;

                default:
                    if( dir % 2 == 0 ) x -= dir - 1;
                    else y -= dir - 2;
            }
        }
        return dir != 0 || (x == 0 && y == 0);
    }
}
