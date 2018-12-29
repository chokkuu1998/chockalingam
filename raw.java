int MAX = 5;

for (i = 1 , i <= MAX; i++)
{
        drawNum[1] = (int)(Math.random()*MAX)+1;

        while (drawNum[2] == drawNum[1])
        {
             drawNum[2] = (int)(Math.random()*MAX)+1;
        }
        while ((drawNum[3] == drawNum[1]) || (drawNum[3] == drawNum[2]) )
        {
             drawNum[3] = (int)(Math.random()*MAX)+1;
        }
        while ((drawNum[4] == drawNum[1]) || (drawNum[4] == drawNum[2]) || (drawNum[4] == drawNum[3]) )
        {
             drawNum[4] = (int)(Math.random()*MAX)+1;
        }
        while ((drawNum[5] == drawNum[1]) ||
               (drawNum[5] == drawNum[2]) ||
               (drawNum[5] == drawNum[3]) ||
               (drawNum[5] == drawNum[4]) )
        {
             drawNum[5] = (int)(Math.random()*MAX)+1;
        }

}
