/*7.What will be the boolean “flag” value to reach the finally block?
a.	try {
b.		if (flag) {
c.			while (true) {
d.			}
e.		} else {
f.			System.exit(1);
g.		}
h.	} finally {
i.		System.out.println("In Finally");
j.	}
*/
package com.mycompany.day17handson.q7;

public class C7 {
    public static void main(String[] args)
    {
        boolean flag = true;
        //boolean flag = false;
        try
        {
            if (flag) {
                while (true) {
                    }
            }
            else {
            System.exit(1);
            }
        } finally {
            System.out.println("In Finally");//This code is unreachable
        }
    }
}
