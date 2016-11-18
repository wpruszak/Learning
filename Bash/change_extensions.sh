#!/usr/bin/env bash

if [[ $# -ne 2 ]]; then
    echo 'Need exactly two arguments.' >&2
    exit 1
fi

for f in *"$1"; do
    base=`basename "$f" "$1"`
    mv "$f" "${base}${2}"
done

exit 0
