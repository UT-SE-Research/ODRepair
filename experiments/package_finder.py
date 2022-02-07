import fnmatch
import os
import re
import sys

def find(pattern, path):
    result = []
    for root, dirs, files in os.walk(path):
        for name in files:
            if fnmatch.fnmatch(name, pattern):
                result.append(os.path.join(root, name))
    return result

def main(args):
    # Pass in path to directory to search for package names
    directory = args[1]
    files = find('*.java', directory)

    packages = set()
    pattern = re.compile('^package (.*);$')
    for file in files:
        with open(file) as f:
            for line in f:
                match = pattern.search(line)
                if match:
                    packages.add(match.group(1))
                    break
    for p in packages:
        print(p)

if __name__ == '__main__':
    main(sys.argv)
