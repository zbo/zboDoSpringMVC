#!/bin/bash
ps -auwx|grep java|grep -v grep|tr -s ' '|cut -f2 -d ' '|xargs kill -9
