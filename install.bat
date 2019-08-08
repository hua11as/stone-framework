cd E:/idea-workspace/bpm-workspace/stone-framework/stone-dependencies
E:
mvn clean install -Dmaven.test.skip=true
cd ../stone-parent
mvn clean install -Dmaven.test.skip=true
cd ..
mvn clean install -Dmaven.test.skip=true
end