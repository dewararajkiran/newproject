<li>
    <span ng-click="toggleVisibility(node)"> {{ ( node.childrenVisibility && node.children.length ) ? '+' : '-' }}</span>
    <input ng-click="checkNode(node)" type="checkbox" ng-checked="node.checked">
    <span>
        {{ $index + 1 }}. {{ node.name }}
    </span>
</li>
