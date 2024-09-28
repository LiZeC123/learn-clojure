pip install jupyterlab
cd /workspaces
git clone  
cd clojupyter/
clojure -T:build uber

# 需要根据上一步的安装结果, 调整这里的名称
clojure -M -m clojupyter.cmdline install --jarfile target/clojupyter-0.4.335-standalone.jar --ident clojupyter-0.4.335