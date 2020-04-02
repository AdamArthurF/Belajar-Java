///*
// * Copyright (c) 2020. Adam Arthur Faizal
// */
//
//package Praktikum12LinkedList1;
//
//import org.w3c.dom.*;
//import java.util.List;
//
//public abstract class SingleLinkedList1<T> implements List<T> {
//    private Node front = null;
//    private int size;
//
//    public void addFirst(T item) {
//        Node newNode = new Node() {
//            @Override
//            public String getNodeName() {
//                return null;
//            }
//
//            @Override
//            public String getNodeValue() throws DOMException {
//                return null;
//            }
//
//            @Override
//            public void setNodeValue(String nodeValue) throws DOMException {
//
//            }
//
//            @Override
//            public short getNodeType() {
//                return 0;
//            }
//
//            @Override
//            public Node getParentNode() {
//                return null;
//            }
//
//            @Override
//            public NodeList getChildNodes() {
//                return null;
//            }
//
//            @Override
//            public Node getFirstChild() {
//                return null;
//            }
//
//            @Override
//            public Node getLastChild() {
//                return null;
//            }
//
//            @Override
//            public Node getPreviousSibling() {
//                return null;
//            }
//
//            @Override
//            public Node getNextSibling() {
//                return null;
//            }
//
//            @Override
//            public NamedNodeMap getAttributes() {
//                return null;
//            }
//
//            @Override
//            public Document getOwnerDocument() {
//                return null;
//            }
//
//            @Override
//            public Node insertBefore(Node newChild, Node refChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node removeChild(Node oldChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node appendChild(Node newChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public boolean hasChildNodes() {
//                return false;
//            }
//
//            @Override
//            public Node cloneNode(boolean deep) {
//                return null;
//            }
//
//            @Override
//            public void normalize() {
//
//            }
//
//            @Override
//            public boolean isSupported(String feature, String version) {
//                return false;
//            }
//
//            @Override
//            public String getNamespaceURI() {
//                return null;
//            }
//
//            @Override
//            public String getPrefix() {
//                return null;
//            }
//
//            @Override
//            public void setPrefix(String prefix) throws DOMException {
//
//            }
//
//            @Override
//            public String getLocalName() {
//                return null;
//            }
//
//            @Override
//            public boolean hasAttributes() {
//                return false;
//            }
//
//            @Override
//            public String getBaseURI() {
//                return null;
//            }
//
//            @Override
//            public short compareDocumentPosition(Node other) throws DOMException {
//                return 0;
//            }
//
//            @Override
//            public String getTextContent() throws DOMException {
//                return null;
//            }
//
//            @Override
//            public void setTextContent(String textContent) throws DOMException {
//
//            }
//
//            @Override
//            public boolean isSameNode(Node other) {
//                return false;
//            }
//
//            @Override
//            public String lookupPrefix(String namespaceURI) {
//                return null;
//            }
//
//            @Override
//            public boolean isDefaultNamespace(String namespaceURI) {
//                return false;
//            }
//
//            @Override
//            public String lookupNamespaceURI(String prefix) {
//                return null;
//            }
//
//            @Override
//            public boolean isEqualNode(Node arg) {
//                return false;
//            }
//
//            @Override
//            public Object getFeature(String feature, String version) {
//                return null;
//            }
//
//            @Override
//            public Object setUserData(String key, Object data, UserDataHandler handler) {
//                return null;
//            }
//
//            @Override
//            public Object getUserData(String key) {
//                return null;
//            }
//        };
//        if (front == null) {
//            front = newNode;
//        } else {
//            newNode.getNextSibling();
//            front = newNode;
//        }
//        size++;
//    }
//
//    public void addLast(T item) {
//        Node newNode = new Node() {
//            @Override
//            public String getNodeName() {
//                return null;
//            }
//
//            @Override
//            public String getNodeValue() throws DOMException {
//                return null;
//            }
//
//            @Override
//            public void setNodeValue(String nodeValue) throws DOMException {
//
//            }
//
//            @Override
//            public short getNodeType() {
//                return 0;
//            }
//
//            @Override
//            public Node getParentNode() {
//                return null;
//            }
//
//            @Override
//            public NodeList getChildNodes() {
//                return null;
//            }
//
//            @Override
//            public Node getFirstChild() {
//                return null;
//            }
//
//            @Override
//            public Node getLastChild() {
//                return null;
//            }
//
//            @Override
//            public Node getPreviousSibling() {
//                return null;
//            }
//
//            @Override
//            public Node getNextSibling() {
//                return null;
//            }
//
//            @Override
//            public NamedNodeMap getAttributes() {
//                return null;
//            }
//
//            @Override
//            public Document getOwnerDocument() {
//                return null;
//            }
//
//            @Override
//            public Node insertBefore(Node newChild, Node refChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node removeChild(Node oldChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public Node appendChild(Node newChild) throws DOMException {
//                return null;
//            }
//
//            @Override
//            public boolean hasChildNodes() {
//                return false;
//            }
//
//            @Override
//            public Node cloneNode(boolean deep) {
//                return null;
//            }
//
//            @Override
//            public void normalize() {
//
//            }
//
//            @Override
//            public boolean isSupported(String feature, String version) {
//                return false;
//            }
//
//            @Override
//            public String getNamespaceURI() {
//                return null;
//            }
//
//            @Override
//            public String getPrefix() {
//                return null;
//            }
//
//            @Override
//            public void setPrefix(String prefix) throws DOMException {
//
//            }
//
//            @Override
//            public String getLocalName() {
//                return null;
//            }
//
//            @Override
//            public boolean hasAttributes() {
//                return false;
//            }
//
//            @Override
//            public String getBaseURI() {
//                return null;
//            }
//
//            @Override
//            public short compareDocumentPosition(Node other) throws DOMException {
//                return 0;
//            }
//
//            @Override
//            public String getTextContent() throws DOMException {
//                return null;
//            }
//
//            @Override
//            public void setTextContent(String textContent) throws DOMException {
//
//            }
//
//            @Override
//            public boolean isSameNode(Node other) {
//                return false;
//            }
//
//            @Override
//            public String lookupPrefix(String namespaceURI) {
//                return null;
//            }
//
//            @Override
//            public boolean isDefaultNamespace(String namespaceURI) {
//                return false;
//            }
//
//            @Override
//            public String lookupNamespaceURI(String prefix) {
//                return null;
//            }
//
//            @Override
//            public boolean isEqualNode(Node arg) {
//                return false;
//            }
//
//            @Override
//            public Object getFeature(String feature, String version) {
//                return null;
//            }
//
//            @Override
//            public Object setUserData(String key, Object data, UserDataHandler handler) {
//                return null;
//            }
//
//            @Override
//            public Object getUserData(String key) {
//                return null;
//            }
//        };
//        if (front == null) {
//            front = newNode;
//        } else {
//            Node curr = front;
//            while (curr.getNextSibling() != null) {
//                curr = curr.getNextSibling();
//            }
//            curr.getNextSibling();
//        }
//        size++;
//    }
//
//    public T get(int index) {
//        Node curr = front;
//        T temp = null;
//        int n = 0;
//        if (index >= size) {
//            return null;
//        }
//        while (curr != null) {
//            if (n == index) {
//                curr.getNodeValue();
//                return temp;
//            }
//            curr = curr.getNextSibling();
//            n++;
//        }
//        return null;
//    }
//}
//
