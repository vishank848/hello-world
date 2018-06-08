# this is the first comment
spam = 1  # and this is the second comment
          # ... and now a third!
text = "# This is not a comment because it's inside quotes."

print(text);

# Fibonacci series:
# the sum of two elements defines the next
a, b = 0, 1
while b < 100:
    print(b)
    a, b = b, a+b

print("================================")

c = 0
d = 1
while d < 100:
    print(d)
    e = c + d
    c = d
    d = e