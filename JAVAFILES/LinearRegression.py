import numpy as np

x=np.array([1,2,3,4,5,6])	//Both are training data
y=np.array([2,4,6,8,10,12])
m,c=fit(x,y)
print (m,c)
y_pred=predict(x,m,c)
print(y_pred)
coeff=cd(y_pred,y)
print(coeff)
costvalue=cost(x,y,m,c)
print(costvalue)

def fit(x,y):
	x_mean=np.mean(x)
	y_mean=np.mean(y)
	m=(np.mean(x*y)-x_mean*y_mean)/(np.mean(x*x)-(x_mean*x_mean))
	c=y_mean-m*x_mean;
	return (m,c)
	
def predict(x,m,c):
	y_pred=[]
	y_pred=m*x+c
	return y_pred
	
def cd(y_pred,y_true):
	u=((y_pred-y_true)**2).sum()
	v=((y_true-statistics.mean(y_true))**2).sum()
	return (1-u/v)
	
def cost(x,y,m,c):
	cost=((y-(m*x+c))**2).sum()
	return cost
	