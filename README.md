# bazaar_mturk_agent

This is a fork of marinawang/bazaar_mturk_agent that uses a different socket
library.  This version is designed to work with the chatroom 
installable from http://github.com/cbogart/Bazaar_installed

It currently does NOT work with the online bazaar chatroom server at CMU.

# TODO
  - Make the socket library choice a configurable option
  - Make the UI optional so Bazaar can run headless
  - Install along with chatroom using docker-compose, so that agent comes up automatically
  - Caliper logging of Agent interaction and experimental conditions
  - LTI integration
