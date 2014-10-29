Chapter 2. Working with Java data types
=======================================

#Integer literal values come in four flavors: binary, decimal, octal, and hexadecimal.

 - Binary number system—A base-2 system, which uses only 2 digits, 0 and 1.
 - Octal number system—A base-8 system, which uses digits 0 through 7 (a total of 8 digits). Here the decimal number 8 is represented as octal 10, decimal 9 as 11, and so on.
 - Decimal number system—The base-10 number system that you use every day. It’s based on 10 digits, from 0 through 9 (a total of 10 digits).
 - Hexadecimal number system—A base-16 system, which uses digits 0 through 9 and the letters A through F (a total of 16 digits and letters). Here the number 10 is represented as A, 11 as B, 12 as C, 13 as D, 14 as E, and 15 as F.
 
## You can assign integer literals in base decimal, binary, octal, and hexadecimal. For octal literals, use the prefix 0 ; for binary, use the prefix 0B or 0b ; and for hexadecimal, use the prefix 0x or 0X .

## With Java version 7, you can also use underscores as part of the literal values, which helps group the individual digits or letters of the literal values and is much more read-able. The underscores have no effect on the values.

long baseDecimal = 100_267_760;<p>
long octVal = 04_13;<p>
long hexVal = 0x10_BA_75;<p>
long binVal = 0b1_0000_10_11;<p>

<table>
    <tr>
        <td>Foo</td>
    </tr>
    <tr>
        <td>Foo</td>
        <td>Foo</td>
        <td>Foo</td>
    </tr>
</table>


[This link](http://example.net/) has no title attribute.

This is a normal paragraph:

    This is a code block.

I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"

I get 10 times more traffic from [Google][] than from
[Yahoo][] or [MSN][].

[google]: http://google.com/        "Google"
[yahoo]:  http://search.yahoo.com/  "Yahoo Search"
[msn]:    http://search.msn.com/    "MSN Search"

ssss

*single asterisks*
**double asterisks**

``There is a literal backtick (`) here.``

![Primitive Data Types](/primitive_data_types.png "Optional title")

<address@example.com>


~~Mistaken text.~~

<div class="footer">
        &copy; 2004 Foo Corporation
    </div>

    
