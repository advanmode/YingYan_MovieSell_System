const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    lintOnSave: false,
    devServer: {
        port: 8888
    },
    publicPath: process.env.NODE_ENV === 'production' ? '/gouyan-ui' : '/'
})