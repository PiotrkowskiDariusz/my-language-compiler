function f
    x = 1
    print x
    read x
    repeat 2
        print x
        y = 4
    endrepeat

    if y == 4 then
        print y
    endif
    f = x
endfunction

f

x = 4 + 5
y = 2 * 6
print x
print y