#!/usr/bin/env bash
printenv
[ -d ~/archive ] || mkdirmkdir ~/archive/
curl ${DOCUMENTURL} > ~/archive/${BUILD_ID}.csv && \
rm -f ~/new.csv && \
ln -s ~/archive/${BUILD_ID}.csv ~/new.csv && \
[ -f ~/currentipmac.csv ] || touch ~/currentipmac.csv
diff ~/new.csv ~/currentipmac.csv