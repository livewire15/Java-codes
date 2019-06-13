import java.util.*;
class min_cost_dp
{
public static void main(String args[])
{
//only working function is made
int input[50][50];
int output[50][50];
output[49][49]=input[49][49];
for(int i=48;i>=0;i--)
{
output[i][49]=output[i+1][49]+input[i][49];
}

for(int j=48;j>=0;j--)
{
output[49][j]=output[49][j+1]+input[49][j];
}

for(int i=48;i>=0;i--)
{
for(int j=48;j>=0;j--)
{
output[i][j]=input[i][j]+Math.min(output[i+1][j],Math.min(output[i+1][j+1],output[i][j+1]));
}
}
}