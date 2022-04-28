<!--    细节配置-->
    <context:component-scan base-package="com.zhouge" use-default-filters="false">
        <context:include-filter type="annotation" expression="org.springframework.stereotype.Component"/>
    </context:component-scan>

    <context:component-scan base-package="com.zhouge">
        <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>