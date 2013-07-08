noot
=============

Noot Language and Compiler. This is me experimenting with programming language design. The compiler will compile Noot to TAM (Triangle Abstract Machine) using a compiler that has been generated by Antlr3 out of an Antlr grammer.

Code examples
-------------

Simple read, calculate and print example:

```
noot

int a, b, c, d;

a = b = 4;
c = b + 3 * 2;

read(d);
print(d + c);
```

Example by using compound expressions. The result of the last expression  before the closing curly bracket will fill a.

```
noot

bool a;

a = {
		int h,i;
		read(h,i);
		(h > i);
	};
```

Using a coumpound expression in an if statement.

```
noot

bool a,b;

b = true;

a = if a == true then {
		int i,j;
		j = 5;
		(j > i);
	}
else
	false
fi;

print(a);
```

Using a while loop.

```
noot

bool a;
int b;

a := true;
b := 0;

while a == true do {
	b := b + 1;
	print(b);
	if b > 10 then { a = false; } fi;
} od;
```

Dot files
-------------

The generated dot files can be opened with [Graphviz](http://www.graphviz.org/).