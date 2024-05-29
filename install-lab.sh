pip install jupyterlab
cd /workspaces
git clone https://github.com/clojupyter/clojupyter.git
clojure -T:build uber

# 需要根据上一步的安装结果, 调整这里的名称
clojure -M -m clojupyter.cmdline install --jarfile target/clojupyter-0.4.325-standalone.jar --ident clojupyter-0.4.325